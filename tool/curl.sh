# add user
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{"name": "test"}' "http://localhost:8080/lmsia-abc/api/users"

# get user
curl "http://localhost:8080/lmsia-abc/api/users/1"
