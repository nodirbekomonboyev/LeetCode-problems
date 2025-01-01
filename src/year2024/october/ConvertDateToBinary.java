package year2024.october;

public class ConvertDateToBinary {
    public String convertDateToBinary(String date) {
        String[] splits = date.split("-");
        return Integer.toBinaryString(Integer.parseInt(splits[0])) +
                "-" +
                Integer.toBinaryString(Integer.parseInt(splits[1])) +
                "-" +
                Integer.toBinaryString(Integer.parseInt(splits[2]));
    }
}
