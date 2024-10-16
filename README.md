This project is an Android application developed using Java and Gradle. The application appears to be a utility tool with multiple functionalities, including a calculator, a unit converter, personal notes, and an about section. It also includes user authentication and account management features using Firebase.

<div style="display: inline-block; margin: 5px;">
    <img src="https://github.com/user-attachments/assets/c7fefe00-40c2-431a-a900-fb40de0eb6dc" width="300" alt="Image 1" />
</div>
<div style="display: inline-block; margin: 5px;">
    <img src="https://github.com/user-attachments/assets/c12b8d25-1012-41cc-b7bb-9d30f46536bc" width="300" alt="Image 2" />
</div>
<br> <!-- line break to separate the rows -->
<div style="display: inline-block; margin: 5px;">
    <img src="https://github.com/user-attachments/assets/09acefe3-d0f2-4a08-afd7-aac1380fd642" width="300" alt="Image 3" />
</div>
<div style="display: inline-block; margin: 5px;">
    <img src="https://github.com/user-attachments/assets/e07fafea-4624-451f-8f67-672d6641ef9d" width="300" alt="Image 4" />
</div>
<br> <!-- line break to separate the rows -->
<div style="display: inline-block; margin: 5px;">
    <img src="https://github.com/user-attachments/assets/ad94bfc5-f234-4716-bb8f-bd5fc9a8a0d6" width="300" alt="Image 5" />
</div>
<div style="display: inline-block; margin: 5px;">
    <img src="https://github.com/user-attachments/assets/d8b3a922-fb98-4bdb-b810-86ee4c0ad912" width="300" alt="Image 6" />
</div>
<br> <!-- line break to separate the rows -->
<div style="display: inline-block; margin: 5px;">
    <img src="https://github.com/user-attachments/assets/2f073259-ea5a-4e61-889a-78734c93562b" width="300" alt="Image 7" />
</div>
<div style="display: inline-block; margin: 5px;">
    <img src="https://github.com/user-attachments/assets/a4c87cde-975a-4fec-8aab-2818bd3725e3" width="300" alt="Image 8" />
</div>


### Key Components

1. **MainActivity.java**:
   - Handles navigation between different sections of the app using a navigation drawer.
   - Contains methods to start activities for different tools like Calculator, Converter, Personal Notes, and About Me.
   - Implements a custom back press behavior to show a confirmation dialog before exiting the app.

2. **PerSonalNote.java**:
   - Manages the personal notes section.
   - Uses Firebase Firestore to store and retrieve notes.
   - Implements a RecyclerView to display notes in a list format.
   - Includes functionality to add new notes using a FloatingActionButton.

3. **SignUpPage.java**:
   - Manages user registration.
   - Validates user input for name, email, password, and gender.
   - Uses Firebase Authentication to create a new user account.
   - Sends a verification email to the user upon successful registration.

### Firebase Integration

- **Authentication**: Used for user sign-up and login functionalities.
- **Firestore**: Used for storing and retrieving personal notes.

### UI Components

- **Navigation Drawer**: Provides easy navigation between different sections of the app.
- **RecyclerView**: Displays a list of personal notes.
- **FloatingActionButton**: Allows users to add new notes.

### User Experience

- **Toasts**: Provide feedback to the user for various actions like navigation and account creation.
- **ProgressBar**: Indicates loading state during account creation.
- **AlertDialog**: Confirms user intent to exit the app.

This project demonstrates a well-structured Android application with multiple functionalities and Firebase integration for backend services.
