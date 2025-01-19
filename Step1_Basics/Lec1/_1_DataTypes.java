package Lec1;
//link: https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type

public class _1_DataTypes {
    static int dataTypeSize(String str){
        int value = 0;
        switch(str){
            case "Character":
                value = Character.SIZE / 8;
                break;
            
            case "Integer":
                value = Integer.SIZE / 8;
                break;

            case "Float":
                value = Float.SIZE / 8;
                break;

            case "Long":
                value = Long.SIZE / 8;
                break;

            case "Double":
                value = Double.SIZE / 8;
                break;

            default:
                value = -1;
        }
        return value;
    }
}

