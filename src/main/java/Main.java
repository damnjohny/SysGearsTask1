import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static List<UnitVariables> enumList = Arrays.asList(UnitVariables.values());

    public static String unit;
    public static double value;
    public static String convert_to;
    private static double result;

    private static final String filePath = "src\\input.json";

    public static void main(String[] args) {

        try {
            // считывание файла JSON
            FileReader reader = new FileReader(filePath);

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            // получение строки из объекта "convert_to"
            convert_to = (String) jsonObject.get("convert_to");

            // обрабатываем структуру в объекте "distance"
            JSONObject structure = (JSONObject) jsonObject.get("distance");
            unit = String.valueOf(structure.get("unit"));
            value = (double) structure.get("value");

        } catch (IOException | ParseException | NullPointerException exception) {
            exception.printStackTrace();
        }

        result = Converter.convert(convert_to, unit, value);

        System.out.println(getResult());
    }


    public static String getResult() {
        return "{\"unit\": " + "\"" +convert_to + "\"" + ", " + "\"value\": " + result + "}";
    }
}
