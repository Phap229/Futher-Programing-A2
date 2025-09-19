# Futher-Programing-A2


| Decision | Rationale | Impact |
|----------|-----------|---------|
| **1. Modular Smart Contract Design** | Gas efficiency, maintainability, separation of concerns | 150K gas registration, 2.5K gas consent checks (O(1)) |
| **2. Hybrid Storage Strategy** | Cost-effective for large files, maintains decentralization | Off-chain files + on-chain SHA-256 integrity verification |
| **3. O(1) Consent Verification** | Real-time performance for frequent checks | 2.5K gas per check, granular data-type permissions |
| **4. Event-Driven Audit Logging** | Cost-effective immutable audit trails | 45K gas per log entry, comprehensive compliance logging |
