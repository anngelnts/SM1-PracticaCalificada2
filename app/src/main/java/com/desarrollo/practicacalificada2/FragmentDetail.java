package com.desarrollo.practicacalificada2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.desarrollo.practicacalificada2.Models.Contact;

import java.util.List;

public class FragmentDetail extends Fragment {

    private List<Contact> contactList;
    int position = 0;
    TextView dataName;
    TextView dataPhone;
    TextView dataEmail;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null){
            if(getArguments() != null){
                position = getArguments().getInt("position", 0);
            }
        }
        contactList = Contact.getItems();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        dataName = view.findViewById(R.id.dataName);
        dataPhone = view.findViewById(R.id.dataPhone);
        dataEmail = view.findViewById(R.id.dataEmail);
        //update view
        dataName.setText(contactList.get(position).getName());
        dataPhone.setText(contactList.get(position).getPhone());
        dataEmail.setText(contactList.get(position).getEmail());
    }

    // Activity is calling this to update view on Fragment
    public void updateView(int position){
        dataName.setText(contactList.get(position).getName());
        dataPhone.setText(contactList.get(position).getPhone());
        dataEmail.setText(contactList.get(position).getEmail());
    }
}
