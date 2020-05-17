package appstart.sorting;
import appfuncs.funcs.FilesFuncs;
import java.util.ArrayList;
import java.util.List;

public class sorting {
    public static void main(String[] args) {
        FilesFuncs.Sort("files/out.txt", "files/sort.txt");
    }
}