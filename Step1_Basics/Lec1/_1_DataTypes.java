package Lec1;
//link: https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type

public class _1_DataTypes {
    public static int dataTypeSize(String str) {
        switch(str.toLowerCase()){
            case "character":
                return Character.SIZE;
            case "integer":
                return Integer.SIZE;
            case "long":
                return Long.SIZE;
            case "float":
                return Float.SIZE;
            case "double":
                return Double.SIZE;
            default:
                return -1;
        }
    }
}

