package com.app.cristian_mejia.rest2.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.app.cristian_mejia.rest2.Controller.AccessToken;
import com.app.cristian_mejia.rest2.Controller.ServiceGenerator;
import com.app.cristian_mejia.rest2.Model.Prospecto;
import com.app.cristian_mejia.rest2.Model.Usuario;
import com.app.cristian_mejia.rest2.Model.iLogin;
import com.app.cristian_mejia.rest2.Model.iProspecto;
import com.app.cristian_mejia.rest2.Model.iUsuarioActual;
import com.app.cristian_mejia.rest2.R;

import java.util.List;

import retrofit.RestAdapter;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //new RestAdapter.Builder().setEndpoint()


        // Create a very simple REST adapter which points the GitHub API endpoint.
//        iProspecto client = ServiceGenerator.createService(iProspecto.class);

        // Fetch and print a list of the contributors to this library.
  //      List<Prospecto> prospectos = client.prospectos(" ", " ", "", "");

    //    for (Prospecto prospecto : prospectos) {
         //   System.out.println(
           //         prospecto.pNombre() + " (" + prospecto.pCedula() + ")");
//        }

        //region login con usuario
//            iLogin loginService =  ServiceGenerator.createService(iLogin.class, "directo@directo.com", "directo123");
//            Usuario usuario = loginService.basicLogin();
        //endregion login con usuario
        //region login con token
 //           iUsuarioActual userService = ServiceGenerator.createService(iUsuarioActual.class, "auth-token");
 //           Usuario usuarioT = userService.me();
        //region login con token
  //      String oToken;
 //       oToken = "";
   //     iLogin loginService2 = ServiceGenerator.createService(iLogin.class, "directo@directo.com", "directo123");
     //   AccessToken accessToken = loginService.getAccessToken(oToken, "authorization_code");
    }




    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {
            case R.id.listarProspecto:
            {
                Intent oIntent = new Intent(this, actListaProspectos.class );
                startActivity(oIntent);
                break;
            }
            case R.id.Doashboard:
            {
                Intent oIntent = new Intent(this, actDashboard.class );
                startActivity(oIntent);
                break;
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
