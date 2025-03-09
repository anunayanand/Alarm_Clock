# ⏰ Java Alarm Clock

## 📌 Overview
The **Java Alarm Clock** is a console-based alarm clock application built using Java. It allows users to set an alarm and plays a sound when the specified time is reached. The program continuously updates the current time on the console until the alarm rings.

## 🎯 Features
- ✅ **Set an Alarm** – Users can enter a time in `HH:MM:SS` format to set an alarm.
- 🔔 **Audio Notification** – Plays an alarm sound when the set time is reached.
- 🕰 **Real-Time Clock Display** – Displays the current time updating every second.
- 🛠 **Simple Console UI** – No GUI dependencies, runs in the terminal.

## 🛠 Technologies Used
- **Java (JDK 8+)** – Core language
- **Java Time API** – For handling alarm scheduling
- **Java Sound API** – For playing alarm sound

## 🚀 Getting Started
### Prerequisites
- Ensure you have **Java 8 or later** installed.
- Place an audio file named `Alarm_Tune.wav` in the project directory.

### Installation & Running the Application
1. **Clone the repository**
   ```bash
  https://github.com/anunayanand/Alarm_Clock.git
   ```
2. **Navigate to the project folder**
   ```bash
   cd java-alarm-clock
   ```
3. **Compile the Java files**
   ```bash
   javac Main.java AlarmClock.java
   ```
4. **Run the application**
   ```bash
   java Main
   ```

## 📸 Example Usage
```
Enter an alarm time (HH:MM:SS) : 12:30:00
Alarm set for : 12:30:00
11:59:58
11:59:59
...
12:30:00
*ALARM NOISES*
Press Enter to stop the alarm: 
```

## 🛠 Customization
- Modify `Alarm_Tune.wav` to change the alarm tone.
- Adjust the alarm checking interval in `AlarmClock.java`.

## 💡 Future Improvements
- 📅 **Multiple Alarms** – Allow users to set multiple alarms.
- 🔊 **Custom Sounds** – Enable users to choose custom alarm tones.
- 🎨 **GUI Version** – Develop a Swing or JavaFX interface.


