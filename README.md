# capacitor-plugin-print-page

A plugin to print the webpage of capacitor app. Available for Android and Web.

- It uses window.print() method on web
- Open up print window manager for android devices.

## Install

```bash
npm install capacitor-plugin-print-page
npx cap sync
```

## API

<docgen-index>

* [`print()`](#print)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### print()

```typescript
print() => Promise<{ status: boolean; }>
```

**Returns:** <code>Promise&lt;{ status: boolean; }&gt;</code>

--------------------

</docgen-api>

### Usage

``` javascript
import { Printpage } from 'capacitor-plugin-print-page';

const App = async ()=>{
    const {status} = await Printpage.print();
}
```