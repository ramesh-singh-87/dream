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


**Design a Key Value Store**

Very easy to design single server key value store. Use in memory Hash Table but one sever cannot handle the
memory requirements.
1. Data compressions
2. Cache: store frequently used keys in memory and rest in disk.

***CAP Theorem***
CAP Theorem states that it is impossible for a distributed system to provide more than 2 of these 3 gurantees:
Consistency: All nodes should see same data if some nodes failed.
Availability: All users should be able to get response when some nodes failed.
Partition Tolerance: The application should work properly when communication  break between 2 nodes.

Let's say we have 3 nodes in our application, n1, n2 and n3 and if n3 node breaks down, we can either implement

***AP***: We will allow reads to n1 and n2 although that may be stale data. For writes to n1 and n2 will be keep happening
and data will be synced when n3 will come up again.

***CP*** We will not allow writes to n1 and n2 to avoid data inconsistency.

***System Components***
Data Partition: can be achieved using consistent hashing.

Data Replication: replicas can be configured as N, and once server is resolved using consistent hashing 
move clockwise to replicate data on first N servers.

Consistency:
Since data is replicated across multiple replicas we can configure the no of acks for write and read operation
when we consider the write/read as successful. These values will be trade offs between latency and consistency.


