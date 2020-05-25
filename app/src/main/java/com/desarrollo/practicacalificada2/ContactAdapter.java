package com.desarrollo.practicacalificada2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.desarrollo.practicacalificada2.Models.Contact;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {

    public ContactAdapter(Activity context, List<Contact> items) {
        super(context,0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.contact_item, parent, false);
        }

        Contact contact = getItem(position);
        TextView tvName = convertView.findViewById(R.id.tvName);
        tvName.setText(contact.getName());
        return convertView;
    }
}
