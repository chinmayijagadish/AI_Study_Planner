# 📱 AI Study Planner – Android App

AI Study Planner is a beginner-friendly Android application built using **Kotlin** and **XML**.  
The app allows users to enter a subject and the number of study hours per day and provides basic feedback using input validation.  
This project is created as part of learning Android development and will be extended with **Generative AI features**.

---

## 🚀 Features

- Clean and simple Android user interface
- Input fields for subject and daily study hours
- Input validation with user feedback
- Button click handling using Toast messages
- Built using standard Android project structure

---

## 🛠️ Tech Stack

- **Programming Language:** Kotlin  
- **UI Design:** XML (ConstraintLayout)  
- **IDE:** Android Studio  
- **Build Tool:** Gradle  
- **Version Control:** Git & GitHub  

---

## 📂 Project Structure
```
AIStudyPlanner/
├── app/
│ ├── src/main/
│ │ ├── java/com/example/aistudyplanner/
│ │ │ └── MainActivity.kt # Main activity logic
│ │ ├── res/
│ │ │ ├── layout/
│ │ │ │ └── activity_main.xml # UI layout
│ │ │ └── values/ # Colors, strings, themes
│ │ └── AndroidManifest.xml
│ └── build.gradle.kts # App-level Gradle config
│
├── gradle/ # Gradle wrapper files
├── gradlew
├── gradlew.bat
├── build.gradle.kts # Project-level Gradle config
├── settings.gradle.kts
└── README.md
```

## ✨ Features

- Simple and clean Android UI
- Input fields for subject and study hours
- Input validation with user feedback
- Button click handling using Toast messages

## 🧠 How the App Works

1. User enters the subject name and number of study hours per day.
2. The app validates the inputs to ensure no field is empty.
3. On button click, a Toast message provides feedback to the user.
4. This logic is handled inside the MainActivity using Kotlin.


##Changes made
Replaced text inputs with dropdown-based course and subject selection,
added slider for study hours, and improved overall user experience.

## 📸 Screenshots
<img width="336" height="638" alt="image" src="https://github.com/user-attachments/assets/9c268677-2ef8-4d48-89f1-0b3ab38b1b0d" />

<img width="320" height="644" alt="image" src="https://github.com/user-attachments/assets/4c677006-d31d-4327-92df-4ceff728c1fd" />

<img width="343" height="646" alt="image" src="https://github.com/user-attachments/assets/b75bc2b2-7b70-4400-b079-ddb2ac645c60" />

## 📘 Learning Outcomes

- Understood Android project structure
- Designed UI using XML and ConstraintLayout
- Handled user input and validation in Kotlin
- Implemented button click listeners
- Used Git and GitHub for version control

## 🔮 Future Enhancements

- Integrate Generative AI API to generate study plans
- Display generated study plans on a new screen
- Improve UI using Material Design components
- Add data persistence for saving plans
