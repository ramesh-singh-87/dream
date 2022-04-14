1. NoSQL databases are grouped into four categories: key-value stores, graph stores, column stores, and document stores. 
2. Non-relational databases might be the right choice if:
   • Your application requires super-low latency.
   • Your data are unstructured, or you do not have any relational data.
   • You only need to serialize and deserialize data (JSON, XML, YAML, etc.).
   • You need to store a massive amount of data.
3. A private IP is an IP address reachable only
   between servers in the same network; however, it is unreachable over the internet.
   
4. A CDN is a network of geographically dispersed servers used to deliver static content. CDN
   servers cache static content like images, videos, CSS, JavaScript files, etc.
   
5. Decoupling makes the message queue a preferred architecture for building a scalable and
   reliable application. With the message queue, the producer can post a message to the queue
   when the consumer is unavailable to process it. The consumer can read messages from the
   queue even when the producer is unavailable.
   
**Design Rate Limiter**

1. In microservices architecture rate limiter are generally implemented in API gateway component.