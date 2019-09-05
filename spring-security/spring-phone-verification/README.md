# Spring Security - How to use Verification with phone
# How it will look like?
    * Open http://localhost:8080
    ![Localhost](res/localhost.png)
    * Click 'Login'
    * Login to your Okta account
    * Send Push notification to the phone
    * You have access for Secured Page!


# Deep diving
Started from this example https://developer.okta.com/blog/2019/03/12/oauth2-spring-security-guide#create-a-new-spring-boot-app

It turns out to be able to use phone verification I don't need to change anything in code.

I have to perform some configuration on the https://developer.okta.com project.

### `First Part` You need to create you Okta app to setup Spring Boot app to use it.

    Okta is a SaaS (software-as-service) authentication and authorization provider. 
    We provide free accounts to developers so they can develop OIDC apps with no fuss. 
    Head over to developer.okta.com and sign up for an account. After you’ve verified your email, 
    log in and perform the following steps:
    
        1. Go to Application > Add Application.
        2. Select application type Web and click Next.
        3. Give the app a name. I named mine “Spring Boot OAuth”.
        4. Under Login redirect URIs change the value to http://localhost:8080/login/oauth2/code/okta. The rest of the default values will work.
        5. Click Done.
        6. Assign yourself to the new created App. Applications -> Assigments -> Assign
        
### `Second Part` Verification with phone named Okta Verify
       1. Enable Okta Verify. Go to Applications -> Sign On -> Sign On Policy -> Add Rule
       2. Actions -> ACCESS -> Enable 'Prompt for factor · Multifactor Settings'
       3. Go to Multifactor Settings link. Enable Okta Verify.
       
Download Okta Verify app to the phone.
Android: https://play.google.com/store/apps/details?id=com.okta.android.auth
IOS: https://apps.apple.com/us/app/okta-verify/id490179405

That's it! Now you can use Phone Verification for your app!

1. Run client app (OktaOauthClientApplication.java) from `okta-oauth-client` module.
2. Go to http://localhost:8080
