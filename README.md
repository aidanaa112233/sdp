# 🚀 SpaceSuit & Planetary Life Support System (Design Patterns Assignment)
Tumenbai Aidana
group:SE-2511
## 📌 Project Overview
This project is an individual assignment for the **Software Design Patterns** course at **Astana IT University**[cite: 6, 8]. It implements and demonstrates the practical application of two major creational design patterns studied in the course:
1. **Factory Method**[cite: 8] — Manages the creation of individual modular components (e.g., Oxygen Tanks, Thermal Regulators) for astronauts.
2. **Abstract Factory**[cite: 8] — Produces families of related life-support and planetary systems (atmosphere controllers and gravity stabilizers) tailored to specific environments like Mars and Venus.

---

##  Technical Architecture & Requirements Met

### Part A: Factory Method
* **Product Interface (`SpacesuitModule`)**: Defines the unified activation contract for all suit components[cite: 8].
* **Concrete Products**: `OxygenTank` and `ThermalRegulator`[cite: 8].
* **Creator Abstract Class (`ModuleCreator`)**: Declares the core factory method[cite: 8].
* **Concrete Creators**: `OxygenFactory` and `ThermalFactory`[cite: 8].

### Part B: Abstract Factory
* **Abstract Products**: `IAtmosphereController` and `IGravityStabilizer`[cite: 8].
* **Concrete Product Families**:
  * *Mars Family:* `MarsAtmosphereController`, `MarsGravityStabilizer`[cite: 8].
  * *Venus Family:* `VenusAtmosphereController`, `VenusGravityStabilizer`[cite: 8].
* **Abstract Factory Interface (`PlanetLifeSupportFactory`)**: Declares the creation methods for product families[cite: 8].
* **Concrete Factories**: `MarsSystemFactory` and `VenusSystemFactory`[cite: 8].
* **Client (`Main`)**: Interacts exclusively through abstract interfaces without directly instantiating concrete classes[cite: 8].

---

##  Clean Code Principles Applied

1. **Meaningful, Intention-Revealing Names:** Classes and methods (`PlanetLifeSupportFactory`, `regulateGas()`) clearly express their domain purpose without ambiguity[cite: 8].
2. **Small Methods, Each Doing One Thing:** Every method is concise and dedicated to a single logical operation[cite: 8].
3. **Validated Construction (Fail-Fast):** Input states are strictly checked; providing an unknown or unsupported planet type throws a clear `IllegalArgumentException`[cite: 8].
4. **No Magic Strings/Numbers:** Configuration parameters and targeted environments are cleanly handled using explicit conditional variables[cite: 8].
5. **Separation of Concerns:** Interfaces, concrete implementations, and factories are organized into dedicated files following clean architectural boundaries[cite: 8].

---

## 🚀 How to Run the Project
1. Open the project folder in **IntelliJ IDEA**.
2. Make sure the Java SDK is properly configured.
3. Navigate to `src/main/java/com/example/zoo/Main.java`.
4. Run the `main` method to see both design patterns in action.
