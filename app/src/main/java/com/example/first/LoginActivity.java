package com.example.first;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class LoginActivity extends AppCompatActivity {
    SignInButton Google_Login;
    Button googleloginBtn, naverloginBtn, kakaologinBtn;
    private Object GoogleSignInClient;
    private Object FirebaseAuth;
    private GoogleApiClient GoogleSignIn;
    private Object Int;
    private boolean GoogleSignInAccount;
    private SignInButton signInButton;
    private GoogleSignInClient mGoogleSignInClient;
    private SignInClient oneTapClient;
    private BeginSignInRequest signInRequest;
    private static final int REQ_ONE_TAP=2;
    private boolean showOneTapUI = true;
    private BeginSignInRequest signUpRequest;
    private static final int RC_SIGN_IN = 9001;
    private static final String TAG="GoogleLogin";
    private GoogleSignInAccount mGoogleSignInAccount;
    private FirebaseAuth auth;
    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
        mGoogleSignInClient = new GoogleApiClient.Builder(this)
                .
        //mGoogleSignInClient = com.google.android.gms.auth.api.signin.GoogleSignIn.getClient(this, gso);

        database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("database");
        //DatabaseReference myRef = database.child("고객").child(""); -->root/고객 이렇게 자식 생성

        myRef.setValue("모모");
        findViewById(R.id.sign_in_button).setOnClickListener(this);

        googleloginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "클릭", Toast.getSignInIntent();
                Intent signInIntent = mGoogleSignInClient.getSignInIntent();
            }
        });


    }



    @Override
    protected void onStart(){
        super.onStart();
        FirebaseUser currentUser = database.getCurrentUser();
        //GoogleSignInAccount account=GoogleSignIn.getLastSignedAccount(this);
        updateUI(currentUser);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_SIGN_IN){
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                GoogleSignInAccount account = task.getResult(ApiException.class);
                firebaseAuthWithGoogle(account.getIdToken());
            }catch (ApiException e){
                Log.w(TAG, "signInResult:failed code="+e.getStatusCode());
                updateUI(null);
            }
            //handleSignInResult(task);
        }
    }
    private void firebaseAuthWithGoogle(String idToken){
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        database.signInWithCredential(credential)
                .addOnCompletedListener(this, new OnCompleteListener<AuthResult>(){
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task){
                        if (task.isSuccessful()){
                            FirebaseUser firebaseUser = database.getCurrentUser();
                            if (firebaseUser != null){
                                Intent intent= new Intent(getApplication().MainActivity.class);
                                startActivity(intent);
                            }
                            updateUI(firebaseUser);
                            Toast.makeText(LoginActivity.this, "로그인 성공", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(LoginActivity.this, "로그인 실패", Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }
                    }
                });
    }

    private void handleSignInResult(Task<GoogleSignInAccount> completedTask){
        try {
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);
            updateUI(account);
        }catch (ApiException e){
            Log.w(TAG, "signInResult:failed code="+e.getStatusCode());
            updateUI(null);
        }
    }

    private void updateUI(GoogleSignInAccount currentUser){
        Intent intent=new Intent(getApplicationContext(), ProfileActivity.class);
        intent.putExtra(ProfileActivity.GOOGLE_ACCOUNT, currentUser);

        startActivityForResult(intent, 1001);
        finish();
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.google_login:
                signIn();
                break;
        }
    }

    private void signIn(){
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }






       /* naverloginBtn = (Button) findViewById(R.id.naverloginBtn);
        naverloginBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                naverloginBtn.setBackgroundColor(Color.rgb(79, 39, 96));
                Intent b = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(b);
                finish();
            }
        });
        kakaologinBtn = (Button) findViewById(R.id.kakaologinBtn);
        kakaologinBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                naverloginBtn.setBackgroundColor(Color.rgb(79, 39, 96));
                Intent c = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(c);
                finish();
            }
        });
    }*/
    /*@Override
    public void onCreate(@Nullable Bundle saveInstanceState,
                         @Nullable PersistableBundle persistableState){
        super.onCreate(saveInstanceState, persistableState);
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignClient = (com.google.android.gms.auth.api.signin.GoogleSignInClient) GoogleSignIn.getClient(this,gso );


        SignInButton signInButton = findViewById(R.id.sign_in_button);
        signInButton.setSize(SignInButton.SIZE_STANDARD);
        findViewById(R.id.sign_in_button).setOnClickListener((View.OnClickListener) this);

        oneTapClient = Identity.getSignInClient(this);
        signInRequest = BeginSignInRequest.builder()
                .setPasswordRequestOptions(BeginSignInRequest.PasswordRequestOptions.builder()
                        .setSupported(true)
                        .build())
                .setGoogleIdTokenRequestOptions(BeginSignInRequest.GoogleIdTokenRequestOptions.builder()
                        .setSupported(true)
                        .setServerClientId(getString(R.string.default_web_client_id))
                        .setFilterByAuthorizedAccounts(true)
                        .build())
                .setAutoSelectEnabled(true)
                .build();

        oneTapClient.beginSignIn(signUpRequest)
                .addOnSuccessListener(this, new OnSuccessListener<BeginSignInResult>() {
                    @Override
                    public void onSuccess(BeginSignInResult result) {
                        try {
                            startIntentSenderForResult(
                                    result.getPendingIntent().getIntentSender(), REQ_ONE_TAP,
                                    null, 0, 0, 0);
                        } catch (IntentSender.SendIntentException e) {
                            Log.e(TAG, "Couldn't start One Tap UI: " + e.getLocalizedMessage());
                        }
                    }
                })
                .addOnFailureListener(this, new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // No saved credentials found. Launch the One Tap sign-up flow, or
                        // do nothing and continue presenting the signed-out UI.
                        Log.d(TAG, e.getLocalizedMessage());
                    }
                });
        GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(transport, jsonFactory)
                // Specify the CLIENT_ID of the app that accesses the backend:
                .setAudience(Collections.singletonList(CLIENT_ID))
                // Or, if multiple clients access the backend:
                //.setAudience(Arrays.asList(CLIENT_ID_1, CLIENT_ID_2, CLIENT_ID_3))
                .build();

// (Receive idTokenString by HTTPS POST)

        GoogleIdToken idToken = verifier.verify(idTokenString);
        if (idToken != null) {
            Payload payload = idToken.getPayload();

            // Print user identifier
            String userId = payload.getSubject();
            System.out.println("User ID: " + userId);

            // Get profile information from payload
            String email = payload.getEmail();
            boolean emailVerified = Boolean.valueOf(payload.getEmailVerified());
            String name = (String) payload.get("name");
            String familyName = (String) payload.get("family_name");
            String givenName = (String) payload.get("given_name");

            // Use or store profile information
            // ...

        } else {
            System.out.println("Invalid ID token.");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case REQ_ONE_TAP:
                try {
                    SignInCredential credential = oneTapClient.getSignInCredentialFromIntent(data);
                    String idToken = credential.getGoogleIdToken();
                    String username = credential.getId();
                    String password = credential.getPassword();
                    if (idToken !=  null) {
                        // Got an ID token from Google. Use it to authenticate
                        // with your backend.
                        Log.d(TAG, "Got ID token.");
                    } else if (password != null) {
                        // Got a saved username and password. Use them to authenticate
                        // with your backend.
                        Log.d(TAG, "Got password.");
                    }
                } catch (ApiException e) {
                    switch (e.getStatusCode()) {
                        case CommonStatusCodes.CANCELED:
                            Log.d(TAG, "One-tap dialog was closed.");
                            // Don't re-prompt the user.
                            showOneTapUI = false;
                            break;
                        case CommonStatusCodes.NETWORK_ERROR:
                            Log.d(TAG, "One-tap encountered a network error.");
                            // Try again or just ignore.
                            break;
                        default:
                            Log.d(TAG, "Couldn't get credential from result."
                                    + e.getLocalizedMessage());
                            break;
                    }
                }
                break;
        }
    }
*/


        //버튼마다 클릭리스너 걸었음 -> 인텐트 다른 엑티비티로 이동필요(로그인 API연동)
       /*googleloginBtn = (Button) findViewById(R.id.googleloginBtn);
        googleloginBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                googleloginBtn.setBackgroundColor(Color.rgb(79, 39, 96));
                Intent a = new Intent(LoginActivity.this, InterestActivity.class);
                startActivity(a);
                finish();
            }
        });*/


   /* @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.sign_in_button:
                signIn();
                break;
        }
    }
    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }*/

}
