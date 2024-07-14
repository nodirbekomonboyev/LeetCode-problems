package july;

public class DefangIPaddr {
    public String defangIPaddr(String address) {
        int length = address.length();
        int i = 0;
        StringBuilder ans = new StringBuilder(address);
        while (i < length - 1){
            int index = ans.indexOf(".", i);
            if(index != -1) {
                ans.replace(index, index + 1, "[.]");
                length += 2;
                i = index + 3;
            } else {
                break;
            }
        }
        return ans.toString();
    }
}
