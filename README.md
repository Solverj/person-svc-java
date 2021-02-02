# person-svc-java
solve@solve ~/git-repositories/Hobby/spring/person-svc-java (master) $ ab -n 100000 -c 100 http://localhost:8080/
This is ApacheBench, Version 2.3 <$Revision: 1843412 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 10000 requests
Completed 20000 requests
Completed 30000 requests
Completed 40000 requests
Completed 50000 requests
Completed 60000 requests
Completed 70000 requests
Completed 80000 requests
Completed 90000 requests
Completed 100000 requests
Finished 100000 requests


Server Software:        
Server Hostname:        localhost
Server Port:            8080

Document Path:          /
Document Length:        16 bytes

Concurrency Level:      100
Time taken for tests:   14.079 seconds
Complete requests:      100000
Failed requests:        0
Total transferred:      14900000 bytes
HTML transferred:       1600000 bytes
Requests per second:    7102.90 [#/sec] (mean)
Time per request:       14.079 [ms] (mean)
Time per request:       0.141 [ms] (mean, across all concurrent requests)
Transfer rate:          1033.53 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    4   3.5      3      54
Processing:     1   10  11.0      6     222
Waiting:        0    9  10.0      5     184
Total:          1   14  11.8      9     222

Percentage of the requests served within a certain time (ms)
  50%      9
  66%     13
  75%     16
  80%     19
  90%     27
  95%     37
  98%     49
  99%     60
 100%    222 (longest request)
solve@solve ~/git-repositories/Hobby/spring/person-svc-java (master) $ ab -n 100000 -c 100 http://localhost:8080/
This is ApacheBench, Version 2.3 <$Revision: 1843412 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 10000 requests
Completed 20000 requests
Completed 30000 requests
Completed 40000 requests
Completed 50000 requests
Completed 60000 requests
Completed 70000 requests
Completed 80000 requests
Completed 90000 requests
Completed 100000 requests
Finished 100000 requests


Server Software:        
Server Hostname:        localhost
Server Port:            8080

Document Path:          /
Document Length:        16 bytes

Concurrency Level:      100
Time taken for tests:   7.497 seconds
Complete requests:      100000
Failed requests:        0
Total transferred:      14900000 bytes
HTML transferred:       1600000 bytes
Requests per second:    13339.40 [#/sec] (mean)
Time per request:       7.497 [ms] (mean)
Time per request:       0.075 [ms] (mean, across all concurrent requests)
Transfer rate:          1940.99 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    3   0.9      3      15
Processing:     1    5   1.5      5      27
Waiting:        1    4   1.4      4      21
Total:          1    7   1.4      7      32

Percentage of the requests served within a certain time (ms)
  50%      7
  66%      8
  75%      8
  80%      8
  90%      9
  95%      9
  98%     11
  99%     13
 100%     32 (longest request)
solve@solve ~/git-repositories/Hobby/spring/person-svc-java (master) $ ab -n 100000 -c 100 http://localhost:8080/persons/
This is ApacheBench, Version 2.3 <$Revision: 1843412 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 10000 requests
Completed 20000 requests
Completed 30000 requests
Completed 40000 requests
Completed 50000 requests
Completed 60000 requests
Completed 70000 requests
Completed 80000 requests
Completed 90000 requests
Completed 100000 requests
Finished 100000 requests


Server Software:        
Server Hostname:        localhost
Server Port:            8080

Document Path:          /persons/
Document Length:        282 bytes

Concurrency Level:      100
Time taken for tests:   21.669 seconds
Complete requests:      100000
Failed requests:        0
Total transferred:      38700000 bytes
HTML transferred:       28200000 bytes
Requests per second:    4614.80 [#/sec] (mean)
Time per request:       21.669 [ms] (mean)
Time per request:       0.217 [ms] (mean, across all concurrent requests)
Transfer rate:          1744.07 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    6   4.2      5      47
Processing:     2   16   8.8     14     257
Waiting:        0   12   7.8     11     246
Total:          2   21   9.8     20     258

Percentage of the requests served within a certain time (ms)
  50%     20
  66%     23
  75%     25
  80%     27
  90%     31
  95%     36
  98%     45
  99%     54
 100%    258 (longest request)
solve@solve ~/git-repositories/Hobby/spring/person-svc-java (master) $ ab -n 100000 -c 100 http://localhost:8080/persons/
This is ApacheBench, Version 2.3 <$Revision: 1843412 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 10000 requests
Completed 20000 requests
Completed 30000 requests
Completed 40000 requests
Completed 50000 requests
Completed 60000 requests
Completed 70000 requests
Completed 80000 requests
Completed 90000 requests
Completed 100000 requests
Finished 100000 requests


Server Software:        
Server Hostname:        localhost
Server Port:            8080

Document Path:          /persons/
Document Length:        282 bytes

Concurrency Level:      100
Time taken for tests:   18.674 seconds
Complete requests:      100000
Failed requests:        0
Total transferred:      38700000 bytes
HTML transferred:       28200000 bytes
Requests per second:    5355.09 [#/sec] (mean)
Time per request:       18.674 [ms] (mean)
Time per request:       0.187 [ms] (mean, across all concurrent requests)
Transfer rate:          2023.85 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    5   2.9      4      28
Processing:     2   14   7.1     12     118
Waiting:        1   11   6.2     10     109
Total:          4   19   6.8     17     121

Percentage of the requests served within a certain time (ms)
  50%     17
  66%     20
  75%     22
  80%     23
  90%     27
  95%     31
  98%     37
  99%     42
 100%    121 (longest request)
