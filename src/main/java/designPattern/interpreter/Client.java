package designPattern.interpreter;

public class Client {
    public static void main(String[] args){
        PlayContext context = new PlayContext();
        //音乐-上海滩 System.out.println("上海滩：");
        context.setText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        Expression expression = null;
        try {
            while (context.getText().length() > 0) {
                String str = context.getText().substring(0, 1);  // 取第一个字符
                switch (str) {
                    case "O":
                        expression = new Scale();
                        break;
                    case "T":
                        expression = new Speed();
                        break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "A":
                    case "B":
                    case "P":
                        expression = new Note();
                        break;
                }
                expression.interpret(context);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
