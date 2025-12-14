Problem Overview

An e-commerce platform needs to notify users when important order events occur, such as:
1. Order Placed
2. Order Shipped
3. Order Delivered

Users can choose how they want to receive notifications:
1. Email
2. SMS
3. Push Notification

The system must:
- Allow runtime switching of notification channels
- Be extensible for future channels (WhatsApp, Slack, etc.)
- Avoid tight coupling between notification logic and business logic
- Follow SOLID principles