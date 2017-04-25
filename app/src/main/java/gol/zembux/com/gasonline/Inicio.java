package gol.zembux.com.gasonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        //Aquí se habilita la sesión de Facebook
        if (AccessToken.getCurrentAccessToken() == null){
            goLoginScreen();
        }
    }

    private void goLoginScreen(){
        Intent intent = new Intent(this, Login.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void logout(View view) {
        LoginManager.getInstance().logOut();
        goLoginScreen();
    }
/*    public void goRegistra(View view){
        Intent in = new Intent(this, Almacenamiento.class);
        startActivity(in);
    }
    public void goImagen(View view){
        Intent inI = new Intent(this, VerImagen.class);
        startActivity(inI);
    }*/
}
