# sc-security-auth-resource-service-hi
资源服务简例 
## 新增用户  
curl -d "username=nie-dongjia&password=123456" "localhost:8762/user/registry"

curl service-hi:123456@localhost:5000/uaa/oauth/token -d grant_type=password -d username=nie-dongjia -d password=123456


## title
Spring Cloud 0Auth2 保护的资源服务，需要验证请求的用户信息和该用户所具有的权限的，验证通过，则正确返回结果，否则返回“不允许访问”的结果。











