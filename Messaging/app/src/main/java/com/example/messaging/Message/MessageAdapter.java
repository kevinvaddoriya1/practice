package com.example.messaging.Message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.messaging.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MyViewHolder> {

    private final List<MessageList> messageLists;
    private final Context context;

    public MessageAdapter(List<MessageList> messageLists, Context context) {
        this.messageLists = messageLists;
        this.context = context;
    }

    @NonNull
    @Override
    public MessageAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.message_adpater_layout,null));
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapter.MyViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return messageLists.size();
    }
    static class MyViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView pfpic;
        private TextView name;
        private TextView lastmsg;
        private TextView unseenmsg;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            pfpic = itemView.findViewById(R.id.pfpic);
            name = itemView.findViewById(R.id.name);
            lastmsg = itemView.findViewById(R.id.lastmsg);
            unseenmsg = itemView.findViewById(R.id.unseenmsg);
        }
    }
}
