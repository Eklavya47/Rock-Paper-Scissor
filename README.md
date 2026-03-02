# 📚 Rock Paper Scissor Android App
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
