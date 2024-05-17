# LearningCompose

Welcome to **LearningCompose**! This project is designed as a comprehensive introduction to Jetpack Compose for Android UI development. Jetpack Compose is Android's modern toolkit for building native UI with a declarative approach. This project will guide you through the essential concepts, components, and practices to get you up and running with Jetpack Compose.

## Introduction

**LearningCompose** is a learning project created to explore and understand Jetpack Compose. The project includes a variety of examples and exercises that demonstrate how to use different Compose components and APIs effectively.

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed on your development machine:

- [Android Studio Arctic Fox or later](https://developer.android.com/studio)
- Kotlin 1.5.21 or later

### Installation

Clone the repository:

```bash
git clone https://github.com/angatiabenson/learning-compose
```

Open the project in Android Studio:

1. Open Android Studio.
2. Select "Open an existing Android Studio project".
3. Navigate to the cloned directory and select it.
4. Let Android Studio configure the project.

## Project Structure

The project follows a modular structure to keep the code organized and easy to navigate.

```
LearningCompose/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/learningcompose/
│   │   │   │   ├── ui/
│   │   │   │   │   ├── components/
│   │   │   │   │   ├── screens/
│   │   │   │   │   └── theme/
│   │   │   │   ├── MainActivity.kt
│   │   │   ├── res/
│   │   │   └── AndroidManifest.xml
│   ├── build.gradle
│   └── ...
└── build.gradle
```

## Key Concepts

### Composables

Composables are the building blocks of Jetpack Compose. They are functions annotated with `@Composable` that define your app's UI.

Example:

```kotlin
@Composable
fun Greeting(name: String) {
    Text(text = "Hello, $name!")
}
```

### State Management

State management in Compose is crucial for building interactive UIs. Use `remember` and `mutableStateOf` to manage state within Composables.

Example:

```kotlin
@Composable
fun Counter() {
    var count by remember { mutableStateOf(0) }
    Button(onClick = { count++ }) {
        Text("Clicked $count times")
    }
}
```

### Layouts

Compose provides various layout Composables such as `Column`, `Row`, `Box`, etc., to arrange your UI elements.

Example:

```kotlin
@Composable
fun SimpleColumn() {
    Column {
        Text("First item")
        Text("Second item")
        Text("Third item")
    }
}
```

### Modifiers

Modifiers are used to decorate or augment Composables. They are used to modify behavior, appearance, and layout.

Example:

```kotlin
@Composable
fun StyledText() {
    Text(
        text = "Hello, Compose!",
        modifier = Modifier.padding(16.dp).background(Color.LightGray)
    )
}
```

### Theming

Jetpack Compose allows you to define a consistent theme for your app, including colors, typography, and shapes.

Example:

```kotlin
@Composable
fun MyAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = darkColors(
            primary = Color.Blue,
            secondary = Color.Green
        )
    ) {
        content()
    }
}
```

## Features

- Basic Composables and layouts
- State management examples
- Theming and styling
- Navigation between screens
- Example components (e.g., buttons, text fields)

## Running the Project

1. Open the project in Android Studio.
2. Connect an Android device or start an emulator.
3. Click on the "Run" button or use the shortcut `Shift + F10`.

## Contributing

Contributions are welcome! If you have any suggestions or improvements, feel free to create a pull request or open an issue.

## Resources

- [Jetpack Compose Documentation](https://developer.android.com/jetpack/compose/documentation)

---

Thank you for checking out **LearningCompose**! Happy coding!
