
# Security Camera Archive Manager (SCAM)

This is a tool for managing the image/video collected from IP Cameras.

## Documentation

[Documentation](https://linktodocumentation)

### How to create self-sign cert

Create you keystore with the following and move it into the resources dir.

```bash
keytool -genkeypair -alias scam -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore scam.p12 -validity 3650
```


## API Reference

#### Get all items

```http
  GET /api/items
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### add(num1, num2)

Takes two numbers and returns the sum.


## Deployment

To deploy this project run

```bash
  mvn clean package -P prod
```


## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`API_KEY`

`ANOTHER_API_KEY`


## Running Tests

To run tests, run the following command

```bash
  mvn test
```

  