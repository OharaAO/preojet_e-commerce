```toml
name = 'create'
method = 'POST'
url = 'http://localhost:8080/CreateProduct'
sortWeight = 2000000
id = '11f7b009-dbf1-4b21-a545-c23e7bd91e14'

[body]
type = 'JSON'
raw = '''
{
  "nom" : "oasis",
  "description" : "Une bouteille de 1L de oasis",
  "prix" : -1,
  "code": "oas"
}'''
```
