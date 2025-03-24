```toml
name = 'update'
method = 'PUT'
url = 'http://localhost:8080/produit/2'
sortWeight = 4000000
id = '67b3e196-e10c-4347-8056-bbd8c349ed7a'

[body]
type = 'JSON'
raw = '''
{
  "id": 2,
  "nom": "orangina",
  "code": "org",
  "description": "Une bouteille de 1L d'orangina",
  "prix": 2.1,
  "etat": {
    "id": 2,
    "nom": "occasion"
  },
  "etiquette": [
    {
      "id": 1,
      "nom": "fête des mères"
    }
  ]
}
  
    
  '''
```
