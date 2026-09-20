Tumenbai Aidana 
group:SE-2511
# SpaceSuit & Planetary Life Support System (Design Patterns Assignment)
## Project Overview
This project is an individual assignment for the **Software Design Patterns** course at **Astana IT University**. It implements and demonstrates the practical application of two major creational design patterns studied in the course:
1. **Factory Method** — Manages the creation of individual modular components (e.g., Oxygen Tanks, Thermal Regulators) for astronauts.
2. **Abstract Factory** — Produces families of related life-support and planetary systems (atmosphere controllers and gravity stabilizers) tailored to specific environments like Mars and Venus.

---

##  Technical Architecture & Requirements Met

### Part A: Factory Method
* **Product Interface (`SpacesuitModule`)**: Defines the unified activation contract for all suit components.
* **Concrete Products**: `OxygenTank` and `ThermalRegulator`.
* **Creator Abstract Class (`ModuleCreator`)**: Declares the core factory method.
* **Concrete Creators**: `OxygenFactory` and `ThermalFactory`.

### Part B: Abstract Factory
* **Abstract Products**: `IAtmosphereController` and `IGravityStabilizer`.
* **Concrete Product Families**:
  * *Mars Family:* `MarsAtmosphereController`, `MarsGravityStabilizer`.
  * *Venus Family:* `VenusAtmosphereController`, `VenusGravityStabilizer`.
* **Abstract Factory Interface (`PlanetLifeSupportFactory`)**: Declares the creation methods for product families.
* **Concrete Factories**: `MarsSystemFactory` and `VenusSystemFactory`.
* **Client (`Main`)**: Interacts exclusively through abstract interfaces without directly instantiating concrete classes.

---

##  Clean Code Principles Applied

1. **Meaningful, Intention-Revealing Names:** Classes and methods (`PlanetLifeSupportFactory`, `regulateGas()`) clearly express their domain purpose without ambiguity.
2. **Small Methods, Each Doing One Thing:** Every method is concise and dedicated to a single logical operation.
3. **Validated Construction (Fail-Fast):** Input states are strictly checked; providing an unknown or unsupported planet type throws a clear `IllegalArgumentException`.
4. **No Magic Strings/Numbers:** Configuration parameters and targeted environments are cleanly handled using explicit conditional variables.
5. **Separation of Concerns:** Interfaces, concrete implementations, and factories are organized into dedicated files following clean architectural boundaries.

---

##  How to Run the Project
1. Open the project folder in **IntelliJ IDEA**.
2. Make sure the Java SDK is properly configured.
3. Navigate to `src/main/java/com/example/zoo/Main.java`.
4. Run the `main` method to see both design patterns in action.
