package App;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class Main {
    public static void main(String[] args) {
        MongoClient client = MongoClients.create("mongodb+srv://ngphat:301002@cluster0.8fmtc.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        
        MongoDatabase db = client.getDatabase("DigitalBulletJournal");
        
        MongoCollection userCol = db.getCollection("user");
        
        Document sampleDoc = new Document("_id","1").append("userName", "ngphat");
        sampleDoc.append("password","301002");
        
        userCol.insertOne(sampleDoc);
    }
}
