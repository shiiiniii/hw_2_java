////1 . Дана строка sql-запроса "select * from students where ". 
//Сформируйте часть WHERE этого запроса, используя StringBuilder. 
//Данные для фильтрации приведены ниже в виде json строки.
//
//Если значение null, то параметр не должен попадать в запрос.
//
//Параметры для фильтрации: 
//{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//
package tasks_1;

import java.util.HashMap;
import java.util.Map;
public class Program{
	public static void main(String[] args){
		Map<String, String> pair1 = new HashMap<String,String>();
		pair1.put("name","Ivanov");
		pair1.put("country","Russia");
		pair1.put("city","Moscow");
		pair1.put("age",null);
		        System.out.println(getQuery(pair1));
		    }
		    public static String getQuery(Map<String, String> params)
		    {
		        StringBuilder s = new StringBuilder();
		        for (Map.Entry<String,String> pair : params.entrySet())
		        {
		            if (pair.getValue() != null)
		            {
		                s.append(pair.getKey() +" - " + pair.getValue()+"; ");
		            }
		        }
		        s.delete(s.toString().length()-2,s.toString().length());
		        return s.toString();
		       
		    }

		}
