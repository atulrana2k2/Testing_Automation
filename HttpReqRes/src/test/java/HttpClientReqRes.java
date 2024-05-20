import org.junit.jupiter.api.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import org.json.JSONObject;


import static org.junit.jupiter.api.Assertions.*;

public class HttpClientReqRes {

    private static final String BASE_URL = "https://reqres.in/api";
    private static HttpClient client;

    @BeforeAll
    public static void setup() {
        client = HttpClient.newHttpClient();
    }

    @Test
    public void testGetUsers() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/users?page=2"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        assertEquals(200, response.statusCode());

        JSONObject jsonResponse = new JSONObject(response.body());
        assertNotNull(jsonResponse.getInt("page"));
        assertTrue(jsonResponse.getJSONArray("data").length() > 0);
    }

    @Test
    public void testGetSingleUser() throws Exception {
        int userId = 2;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/users/" + userId))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        assertEquals(200, response.statusCode());

        JSONObject jsonResponse = new JSONObject(response.body());
        assertEquals(userId, jsonResponse.getJSONObject("data").getInt("id"));
    }

    @Test
    public void testGetSingleUserNotFound() throws Exception {
        int userId = 23;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/users/" + userId))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        assertEquals(404, response.statusCode());
    }

    @Test
    public void testCreateUser() throws Exception {
        String jsonPayload = new JSONObject()
                .put("name", "Atul")
                .put("job", "SD")
                .toString();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/users"))
                .POST(BodyPublishers.ofString(jsonPayload))
                .header("Content-Type", "application/json")
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        assertEquals(201, response.statusCode());

        JSONObject jsonResponse = new JSONObject(response.body());
        assertEquals("Atul", jsonResponse.getString("name"));
        assertEquals("SD", jsonResponse.getString("job"));
    }

    @Test
    public void testUpdateUserPut() throws Exception {
        int userId = 2;
        String jsonPayload = new JSONObject()
                .put("name", "King")
                .put("job", "President")
                .toString();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/users/" + userId))
                .PUT(BodyPublishers.ofString(jsonPayload))
                .header("Content-Type", "application/json")
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        assertEquals(200, response.statusCode());

        JSONObject jsonResponse = new JSONObject(response.body());
        assertEquals("King", jsonResponse.getString("name"));
        assertEquals("President", jsonResponse.getString("job"));
    }

    @Test
    public void testDeleteUser() throws Exception {
        int userId = 2;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/users/" + userId))
                .DELETE()
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        assertEquals(204, response.statusCode());
    }

}
