export interface PrintpagePlugin {
  print(): Promise<{ status:boolean }>
}
