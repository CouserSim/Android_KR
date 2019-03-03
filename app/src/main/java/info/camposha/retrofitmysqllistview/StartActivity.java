package info.camposha.retrofitmysqllistview;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

// private String[] scope = new String[]{VKScope.WALL};
//
// @Override
// protected void onCreate(Bundle savedInstanceState) {
//     super.onCreate(savedInstanceState);
//     setContentView(R.layout.activity_main);
//    // String[] fingerprints = VKUtil.getCertificateFingerprint(this, this.getPackageName());
//    // System.out.println(Arrays.asList(fingerprints));
//     VKSdk.login(this,scope);
// }
// @Override
// protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//     if (!VKSdk.onActivityResult(requestCode, resultCode, data, new VKCallback<VKAccessToken>() {
//         @Override
//         public void onResult(VKAccessToken res) {
//             Toast.makeText(getApplicationContext(),"Good",Toast.LENGTH_SHORT).show();
//         }
//         @Override
//         public void onError(VKError error) {
//             Toast.makeText(getApplicationContext(),"FAIL",Toast.LENGTH_SHORT).show();
//         }
//     })) {
//         super.onActivityResult(requestCode, resultCode, data);
//     }
// }

    public void newScreen(View v) {
        Intent intObj = new Intent(this, MainActivity.class);
        startActivity(intObj);
    }

    public void newScreen2(View z) {
        Intent intObj = new Intent(this, BronActivity.class);
        startActivity(intObj);
    }
    public void newScreen3(View z) {
        Intent intObj = new Intent(this, MapsActivity.class);
        startActivity(intObj);
    }
   public void newScreen4(View z) {
       Intent intObj = new Intent(this, InfoActivity.class);
       startActivity(intObj);}


}

