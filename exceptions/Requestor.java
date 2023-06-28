package exceptions;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public final class Requestor {
    public static void main(final String[] args) {
        request();
        System.out.println("hello");
    }

    private static void request() {
        try {
            final URL url = new URL("https://reqres.in/api/users?page=2");
            final HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            final InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
            final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            System.out.println(bufferedReader.readLine());
        } catch (final MalformedURLException e) {
            System.out.println("Malformed URL");
            e.printStackTrace();
        } catch (final IOException e) {
            System.out.println("IO exception");
            e.printStackTrace();
        }
    }
}
