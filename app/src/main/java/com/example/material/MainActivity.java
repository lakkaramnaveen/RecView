package com.example.material;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Nani", "nani@gmail.com","https://cdn.pixabay.com/photo/2021/08/25/20/42/field-6574455__340.jpg"));
        contacts.add(new Contact("Chinni", "chini@gmail.com","https://cdn.pixabay.com/photo/2021/08/25/20/42/field-6574455__340.jpg"));
        contacts.add(new Contact("Fayaz", "fayaz@gmail.com","https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg"));
        contacts.add(new Contact("Tomy", "tomy@gmail.com","https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new LinearLayoutManager(this));

    }
}