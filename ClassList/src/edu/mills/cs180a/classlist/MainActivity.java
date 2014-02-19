
package edu.mills.cs180a.classlist;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * An {@code Activity} that displays a list of the names of people in CS 180A.
 * If a name is clicked on, a confirmatory {@link Toast} will be displayed.
 *
 * @author ellen.spertus@gmail.com (Ellen Spertus)
 *
 * @see Person
 */
public class MainActivity extends Activity implements ListView.OnItemClickListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<Person> adapter = new ArrayAdapter<Person>(this,
                android.R.layout.simple_list_item_1, Person.everyone);
        ListView listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        sendEmailTo(Person.everyone[position]);
    }

    private void sendEmailTo(Person person) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", person.getEmail(), null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Hello from " + getString(R.string.app_name));
        String firstName = person.getFirstName();
        emailIntent.putExtra(Intent.EXTRA_TEXT, new StringBuilder(firstName.length() + 5)
                .append("Hi, ")
                .append(firstName)
                .append('!')
                .toString());
        try {
            startActivity(Intent.createChooser(emailIntent, "Send Email"));
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT)
                    .show();
        }
    }
}
