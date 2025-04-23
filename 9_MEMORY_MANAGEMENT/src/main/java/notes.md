Types of Memory:
- Stack
- Heap

Both Stack and Heap are created by JVM and stored in RAM.

### Stack Memory:
    - Stores temporary variables.
    - Store primitive data types.
    - Store reference of Heap Objects.
        - Weak Reference
            - Soft Reference
        - Strong Reference
    - Each thread has its own stack.
    - Variables within a SCOPE is only visible and as soon as any variable goes out of SCOPES it gets deleted.
    - When Stack memory is full it throws: "StackOverflowError"

Weak Reference:
- Weak Reference is a type of reference that does not prevent the object from being garbage collected.
- Whenever GC is triggered, the object will be garbage collected even if it has a reference.
- The object holding reference from stack will then show null.

Strong Reference:
- Strong Reference is a type of reference that prevents the object from being garbage collected.
- GC does not delete objects with strong reference.

Soft Reference:
- Type of Weak Reference
- Delete the object if it very urgent(no more space in memory).\

### Heap Memory:
- Young Generation
  - Eden
  - S0(Survivors)
  - S1(Survivors)
- Old/Tenured Generation
- Non Heap Meta Space

- New Object goes into Eden
- Eden -> S0 -> S1 -> Old Generation

GC invokes
- Mark & Sweep Algorithm
  - Mark : Mark all Unreferenced Objects
  - Sweep : Delete all Unreferenced Objects from memory and move to Survivors

### Garbage Collector:
- GC is invoked automatically by JVM.
- Invoke using System.gc() method.
- Algorithms:
  - Mark & Sweep Algorithm
  - Mark & Sweep with Compact Algorithm
- Versions:
  - Serial GC: Single Thread GC. Slow. If GC starts whole process gets stopped.
  - Parallel GC(Default in Java 8): Multi Thread GC. Fast.
  - Concurrent Mark & Sweep: Try to run GC with application concurrent execution. Does not support memory compaction.
  - G1: Better version of CMS. GC won't stop application execution. Supports memory compaction.