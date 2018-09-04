package json_demo;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON_Writer
{
    public static void main(String args[])
    {
        try
        {
            // Create a new JSONObject
            JSONObject jsonObject = new JSONObject();

            // Add the values to the jsonObject
            jsonObject.put("Name", "Prasanna");
            jsonObject.put("Age", "25");

            // Create a new JSONArray object
            JSONArray jsonArray = new JSONArray();

            // Add values to the jsonArray
            jsonArray.add("C");
            jsonArray.add("CPP");
            jsonArray.add("JAVA");

            // Add the jsoArray to jsonObject
            jsonObject.put("LANGUAGE", jsonArray);

            JSONObject address = new JSONObject();
            address.put("FirstLine", "simmakal");
            address.put("secondLine", "Madurai");
            address.put("postcode", "625001");
        
            jsonObject.put("address", address);
            
            boolean multipleContacts = (Boolean) jsonObject.get("MultipleContacts");
             // Create a new FileWriter object
            FileWriter fileWriter = new FileWriter("/home/osgdev/Documents//sample.json");

            // Writting the jsonObject into sample.json
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.close();

            System.out.println("JSON Object Successfully written to the file!!");

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
