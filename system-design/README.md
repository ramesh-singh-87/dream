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

Token bucket Algorithm:
1. Bucket Size, Rate of filling the bucket, no of buckets.

Leaking Bucket Algorithm
1. Queue Size, and outflow rate, rate at which the requests will be filled

Fixed Window Counter Algorithm

**Design Consistent Hashing**

Used in horizontal scaling to distribute data evenly across multiple servers.

Consistent hashing is a special kind of hashing such that when a
hash table is re-sized and consistent hashing is used, only k/n keys need to be remapped on
average, where k is the number of keys, and n is the number of slots. In contrast, in most
traditional hash tables, a change in the number of array slots causes nearly all keys to be
remapped.

hash functions are separated in a circle. When any server is removed or added only handful of hash functions get effected.
To normalize the distribution of hash functions we can create virtual nodes which refers to actual nodes.
To find the number of keys to be rehashed move anti-cloclwise from the deleted/added node till you find another server and count the keys in between.
