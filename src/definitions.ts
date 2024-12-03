export interface PrintpagePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
