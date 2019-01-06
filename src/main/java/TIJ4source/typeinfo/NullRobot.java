package TIJ4source.typeinfo;//: typeinfo/NullRobot.java
// Using a dynamic proxy to create a Null Object.
import java.lang.reflect.*;
import java.util.*;

import TIJ4source.concurrency.Robot;
import net.mindview.util.*;

class NullRobotProxyHandler implements InvocationHandler {
  private String nullName;
  private TIJ4source.concurrency.Robot proxied = new NRobot();
  NullRobotProxyHandler(Class<? extends TIJ4source.concurrency.Robot> type) {
    nullName = type.getSimpleName() + " NullRobot";
  }
  private class NRobot implements Null, TIJ4source.concurrency.Robot {
    public String name() { return nullName; }
    public String model() { return nullName; }
    public List<Operation> operations() {
      return Collections.emptyList();
    }
  }	
  public Object
  invoke(Object proxy, Method method, Object[] args)
  throws Throwable {
    return method.invoke(proxied, args);
  }
}

public class NullRobot {
  public static TIJ4source.concurrency.Robot
  newNullRobot(Class<? extends TIJ4source.concurrency.Robot> type) {
    return (TIJ4source.concurrency.Robot)Proxy.newProxyInstance(
      NullRobot.class.getClassLoader(),
      new Class[]{ Null.class, TIJ4source.concurrency.Robot.class },
      new NullRobotProxyHandler(type));
  }	
  public static void main(String[] args) {
    TIJ4source.concurrency.Robot[] bots = {
      new SnowRemovalRobot("SnowBee"),
      newNullRobot(SnowRemovalRobot.class)
    };
    for(TIJ4source.concurrency.Robot bot : bots)
      TIJ4source.concurrency.Robot.Test.test(bot);
  }
} /* Output:
Robot name: SnowBee
Robot model: SnowBot Series 11
SnowBee can shovel snow
SnowBee shoveling snow
SnowBee can chip ice
SnowBee chipping ice
SnowBee can clear the roof
SnowBee clearing roof
[Null Robot]
Robot name: SnowRemovalRobot NullRobot
Robot model: SnowRemovalRobot NullRobot
*///:~
