import mysql.connector

conn = mysql.connector.connect(
    host='127.0.0.1',
    port=3306,
    user='root',
    password='hu820826',
    database='imooc'
    )
cursor = conn.cursor()
sql = 'select * from emp_info'
cursor.execute(sql)

print(cursor.rowcount)

# rs1 = cursor.fetchone();
# print(rs1)
# 
# rs2 = cursor.fetchmany(3);
# print(rs2)


rs3 = cursor.fetchall()
print(rs3)
for row in rs3:
    print("id=%s, name=%s, sex=%s, job=%s, mobile=%s" %row)



# if len(data) > 0:
#     for x in range(len(data)):
#         print(data[x])

#print(conn)
#print(cursor)

cursor.close()
conn.close()
