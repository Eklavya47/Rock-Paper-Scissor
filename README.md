# 🎮 Rock Paper Scissor Android App
A fun and interactive Rock Paper Scissor app built using Kotlin and XML. This app allows users to play the classic game either against a friend on the same device or against a computer opponent, featuring a clean UI and smooth transitions.

# ✨ Features
- 🎮 **Dual Game Modes** – Choose between playing with a friend or challenging the computer.
- 🤖 **Computer Opponent** – Play against an AI with randomized moves for a challenging experience.
- 👥 **Local Multiplayer** – Compete with a friend locally on a single device.
- 🏆 **Result Tracking** – Dedicated finish screens to announce the winner of each round.
- 💡 **Instructions Dialog** – Easy-to-access instructions to help players get started.
- 🎨 **Modern UI** – Built with Material Design components, custom gradients, and edge-to-edge display support.
- 🎞️ **Animated Visuals** – Integrated GIF support for a more engaging user experience.

# 📸 Screenshots
<img width="378" height="796" alt="home screen" src="https://github.com/user-attachments/assets/04d4f251-1098-41c6-9372-3a8f2f2bcb1f" />
<img width="372" height="793" alt="play with other" src="https://github.com/user-attachments/assets/e24b0d1a-5d2f-4919-858d-ff8e40c7c261" />
<img width="382" height="797" alt="play with other2" src="https://github.com/user-attachments/assets/1b639fb5-ebd3-4481-ad18-7eba8d8796c9" />
<img width="387" height="797" alt="finish screen" src="https://github.com/user-attachments/assets/24b4f4cd-d6da-46c3-8644-0352081ad87e" />
<img width="387" height="798" alt="play with computer" src="https://github.com/user-attachments/assets/cc688c3f-4cd4-47dd-a3b0-5bc18c1cca0e" />
<img width="378" height="803" alt="finish screen2" src="https://github.com/user-attachments/assets/a1b1ce29-605e-4528-8526-146edd12a708" />
<img width="377" height="797" alt="instructions" src="https://github.com/user-attachments/assets/d5a14dce-4c10-4a2c-ae45-ef331031730b" />

# ⚙️ Tech Stack
- **Language**: Kotlin
- **UI Framework**: XML (View Binding)
- **Architecture**: Standard Android Architecture
- **Animations**: Android GIF Drawable library
- **UI Components**: Material Design, ConstraintLayout

# 📂 Project Structure
- **com/betanooblabs/rockpaperscissor/**: Main package containing game logic and activities
- **MainActivity.kt**: The entry point of the app, providing access to game modes and instructions.
- **PlayWithOther.kt**: Handles the logic and UI for the two-player local mode.
- **PlayWithComputer.kt**: Manages the gameplay when playing against the AI.
- **FinishActivity.kt**: Displays the results for the local multiplayer matches.
- **FinishComp.kt**: Displays the results for matches against the computer.
- **res/layout/**: XML layout files for all activities and custom dialogs.
- **res/values/**: Resource files for colors, themes, and strings.

# 🚀 Getting Started
Follow these steps to run the project locally:
1. Clone the repository
2. Open the project in Android Studio
3. Sync the project with Gradle files
4. Run the app on an emulator or physical device

# 🔧 Requirements
- Android Studio Hedgehog or later
- Minimum SDK: 23
- Target SDK: 36
- Kotlin 1.9.0 or higher

# 🤝 Contributing
Contributions are welcome! If you'd like to fix a bug or add a feature, feel free to fork the repository and submit a pull request.
