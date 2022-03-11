
public class Usuario {

    public String nombre;
    public String correo;

    public Usuario(String nombre, String correo) {
       this.nombre = nombre;
       this.correo = correo;
    }

}

public class UsuariosAdapter extends ArrayAdapter<Usuario> {

    public UsuariosAdapter(Context context, ArrayList<Usuario> usuarios) {
       super(context, 0, usuarios);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       Usuario usuario = getItem(position);    
       if (convertView == null) {
          convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_usuario, parent, false);
       }

       TextView tvnombre = (TextView) convertView.findViewById(R.id.tvnombre);
       TextView tvCorreo = (TextView) convertView.findViewById(R.id.tvCorreo);
       tvnombre.setText(usuario.nombre);
       tvCorreo.setText(usuario.correo);

       return convertView;

   }


// atacha el adaptador al listview

ArrayList<Usuario> arrayOfUsuarios = new ArrayList<Usuario>();


UsuariosAdapter adapter = new UsuariosAdapter(this, arrayOfUsuarios);


ListView listView = (ListView) findViewById(R.id.lvItems);
listView.setAdapter(adapter);
}


// Agrega al adaptador

Usuario newUsuario = new Usuario("unusuario", "correo@correo.com");
adapter.add(newUsuario);


//
// Construir modelos desde datos externos
//

public class Usuario {

    // Constructor to convert JSON object into a Java class instance
    public Usuario(JSONObject object){
        try {
            this.nombre = object.getString("nombre");
            this.correo = object.getString("correo");
       } catch (JSONException e) {
            e.printStackTrace();
       }
    }


    public static ArrayList<Usuario> fromJson(JSONArray jsonObjects) {
           ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
           for (int i = 0; i < jsonObjects.length(); i++) {
               try {
                  usuarios.add(new Usuario(jsonObjects.getJSONObject(i)));
               } catch (JSONException e) {
                  e.printStackTrace();
               }
          }
          return usuarios;
    }
}


