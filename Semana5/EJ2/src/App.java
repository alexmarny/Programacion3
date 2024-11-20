import java.util.Arrays;
import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
	String[] strings = new String[5];

	for (int i = 0; i < 5; i++) {
		String prompt = "introduce el string numero " + (i + 1) + ":";
		strings[i] = Esdia.readString(prompt);
	}

	Arrays.sort(strings);

	System.out.println("Strings ordenadasa:");
	for (String str : strings) {
		System.out.println(str);
	}

	
    }
}
