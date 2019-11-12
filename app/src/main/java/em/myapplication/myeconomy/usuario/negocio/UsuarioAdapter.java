package em.myapplication.myeconomy.usuario.negocio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import em.myapplication.myeconomy.R;
import em.myapplication.myeconomy.usuario.dominio.Usuario;

public class UsuarioAdapter extends ArrayAdapter<Usuario> {

    private ArrayList<Usuario> usuarios;

    public UsuarioAdapter(Context context, ArrayList<Usuario> usuarios) {
        super(context, 0,usuarios);
        this.usuarios = usuarios;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Usuario usuario = usuarios.get(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_usuario,null);

        TextView textViewNome = (TextView)convertView.findViewById(R.id.textViewNome);
        TextView textViewEmail = (TextView)convertView.findViewById(R.id.textViewEmail);

        textViewNome.setText(usuario.getNome().toString());
        textViewEmail.setText(usuario.getEmail().toString());

        return  convertView;
    }
}

