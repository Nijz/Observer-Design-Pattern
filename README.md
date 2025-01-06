The Observer Pattern is a behavioral design pattern where an object, known as the subject, maintains a list of its dependents, called observers, and notifies them automatically whenever its state changes. This ensures a one-to-many dependency. The pattern promotes loose coupling, as the subject doesn’t need to know details about its observers.

In a product stock system, the Observer Pattern is useful for notifying various components when a product’s stock changes. Here’s how it works:

Scenario => Product Stock
Observers: Customers, Warehouse Management System, Vendor Notifications
When the stock quantity of a product changes (e.g., due to a sale or restock), all observers need to be informed to take appropriate actions.

How It Works:

Maintains a list of all observers.
 - Updates its state (stock level).
 - Notifies observers whenever stock changes.
 - Observers (Subscribers):

Customers: Get notified when an out-of-stock product is available again.
 - Warehouse System: Updates inventory records in real-time.
 - Vendors: Receive notifications to restock items when levels drop below a threshold.

Real-Life Example: Consider an e-commerce platform
Frontend UI: Updates "In Stock" or "Out of Stock" label on the product page.
Customers: Sends an email notification to waiting customers when the product is back in stock.
Logistics System: Adjusts shipping options based on stock availability.

Benefits => 
 - Ensures all systems stay synchronized without tight coupling.
 - Improves user experience by keeping stakeholders (customers, systems) updated.
 - Easily scalable by adding more observers without modifying the subject.

-> Handwritten Notes for Visual Understanding
![20250106_153225](https://github.com/user-attachments/assets/82232d9b-a886-4bee-83a4-4f9593113b51)
![20250106_161013](https://github.com/user-attachments/assets/9f5032b9-3f7e-4c6c-b04e-96b3664561f5)

Thank You 😊
Jay Shree Krishn 🙏🏻
