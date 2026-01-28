# 🛡️ SafeHaven

## What is SafeHaven?

**SafeHaven** is a security-first Android application designed to act as a **personal data vault**. The goal of the app is to help users safely store and manage sensitive personal information such as IDs, documents, notes, and credentials.

The app is built with an **offline-first mindset**, meaning user data remains available even without an internet connection. Strong security features such as encryption and biometric authentication are planned and will be introduced incrementally.

SafeHaven is not just an app — it is a learning-driven, production-grade project that demonstrates clean Android architecture, modern development practices, and scalability.

---

## Architecture Overview

SafeHaven follows a **clean, layered MVVM architecture** to ensure separation of concerns, testability, and long-term maintainability.

```
UI (Jetpack Compose)
   ↓
ViewModel (StateFlow)
   ↓
Domain (UseCases)
   ↓
Data (Room / Encrypted Storage)
```

### UI Layer

* Built using **Jetpack Compose**
* Displays state and reacts to changes
* Contains no business logic
* Observes state exposed by ViewModels

### ViewModel Layer

* Owns UI state
* Handles user intents and business logic
* Exposes immutable state using `StateFlow`
* Lifecycle-aware and survives configuration changes

### Domain Layer (Planned)

* Contains business rules and use cases
* Acts as an abstraction between UI/ViewModel and data sources
* Keeps the app logic independent of frameworks

### Data Layer (Planned)

* Handles data persistence and retrieval
* Will use **Room** for local storage
* Will introduce **encrypted storage** for sensitive data

---

## Why MVVM?

The **MVVM (Model-View-ViewModel)** pattern was chosen to enforce clear responsibility boundaries:

* **Separation of concerns**: UI, logic, and data are cleanly separated
* **Testability**: ViewModels can be unit-tested without UI dependencies
* **Lifecycle safety**: ViewModels survive configuration changes
* **Scalability**: New features can be added without breaking existing code

The UI layer remains a *pure renderer of state*, while all decisions and logic live in the ViewModel.

---

## Tech Stack

* **Kotlin** – primary programming language
* **Jetpack Compose** – modern declarative UI framework
* **StateFlow** – reactive state management
* **Navigation Compose** – in-app navigation
* **Material 3** – modern UI components and theming

---

## Current Status (Week 1)

* Feature-based project structure
* Navigation graph setup
* Material 3 theme with dark mode support
* MVVM architecture with `UiState` + `StateFlow`
* Clean app entry point (`SafeHavenApp`)

---

## What’s Next

Planned improvements and features:

* **Room database** for persistent local storage
* **Encryption** for sensitive data at rest
* **Biometric authentication** (Fingerprint / Face)
* Repository pattern
* Use cases in the domain layer
* Improved UI and user experience

---

## Purpose of This Project

This project is built to:

* Demonstrate real-world Android architecture
* Serve as a strong portfolio project
* Practice security-focused Android development
* Learn scalable app design principles

SafeHaven prioritizes **clarity, correctness, and long-term maintainability** over shortcuts.
