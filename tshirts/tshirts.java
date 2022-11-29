public class tshirts {
    static String size(int cms) {
        if(cms <= 38) {
            return "S";
        } else if(cms > 38 && cms < 42) {
            return "M";
        } else {
            return "L";
        }
    }

    public static void main(String[] args) { 
    	assert(tshirts.size(37) == "S");
        assert(tshirts.size(38) == "S");
        assert(tshirts.size(40) == "M");
        assert(tshirts.size(42) == "L");
        assert(tshirts.size(43) == "L");
        System.out.println("All is well (maybe!)");
    }
}
