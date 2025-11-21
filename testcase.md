# Test Cases for SauceDemo Login

## Objective
To verify the login functionality of the SauceDemo website (`https://www.saucedemo.com/`).

## Pre-conditions
- A web browser is installed and accessible.
- Internet connection is stable.

## Test Data
- **Valid Username:** `standard_user`
- **Valid Password:** `secret_sauce`
- **Invalid Username:** `invalid_user`
- **Invalid Password:** `wrong_password`

---

## Test Case 1: Successful Login with Valid Credentials

### Test ID
SD_LOGIN_001

### Description
Verify that a user can successfully log in to the SauceDemo website using valid credentials.

### Steps
1. Navigate to the SauceDemo login page: `https://www.saucedemo.com/`
2. Enter `standard_user` into the "Username" field.
3. Enter `secret_sauce` into the "Password" field.
4. Click the "Login" button.

### Expected Result
- The user is redirected to the products page (`https://www.saucedemo.com/inventory.html`).
- The "Products" title is visible.
- The URL changes to `https://www.saucedemo.com/inventory.html`.

---

## Test Case 2: Unsuccessful Login with Invalid Username

### Test ID
SD_LOGIN_002

### Description
Verify that a user cannot log in with an invalid username and receives an appropriate error message.

### Steps
1. Navigate to the SauceDemo login page: `https://www.saucedemo.com/`
2. Enter `invalid_user` into the "Username" field.
3. Enter `secret_sauce` into the "Password" field.
4. Click the "Login" button.

### Expected Result
- An error message "Epic sadface: Username and password do not match any user in this service" is displayed.
- The user remains on the login page.

---

## Test Case 3: Unsuccessful Login with Invalid Password

### Test ID
SD_LOGIN_003

### Description
Verify that a user cannot log in with an invalid password and receives an appropriate error message.

### Steps
1. Navigate to the SauceDemo login page: `https://www.saucedemo.com/`
2. Enter `standard_user` into the "Username" field.
3. Enter `wrong_password` into the "Password" field.
4. Click the "Login" button.

### Expected Result
- An error message "Epic sadface: Username and password do not match any user in this service" is displayed.
- The user remains on the login page.

---

## Test Case 4: Unsuccessful Login with Empty Username

### Test ID
SD_LOGIN_004

### Description
Verify that a user cannot log in with an empty username and receives an appropriate error message.

### Steps
1. Navigate to the SauceDemo login page: `https://www.saucedemo.com/`
2. Leave the "Username" field empty.
3. Enter `secret_sauce` into the "Password" field.
4. Click the "Login" button.

### Expected Result
- An error message "Epic sadface: Username is required" is displayed.
- The user remains on the login page.

---

## Test Case 5: Unsuccessful Login with Empty Password

### Test ID
SD_LOGIN_005

### Description
Verify that a user cannot log in with an empty password and receives an appropriate error message.

### Steps
1. Navigate to the SauceDemo login page: `https://www.saucedemo.com/`
2. Enter `standard_user` into the "Username" field.
3. Leave the "Password" field empty.
4. Click the "Login" button.

### Expected Result
- An error message "Epic sadface: Password is required" is displayed.
- The user remains on the login page.
