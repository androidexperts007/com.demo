package app.testwebservice;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;

import com.coolgurukul.backend.ArticlesListService;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView view = (TextView)findViewById(R.id.tv);
        ArticlesListService a = new ArticlesListService();
        try {
			JSONArray array = a.getArticlesList();
			String b = array.get(0).toString();
			view.setText(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
