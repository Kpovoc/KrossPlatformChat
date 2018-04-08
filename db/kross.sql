BEGIN TRANSACTION;
-- Create users table
CREATE TABLE IF NOT EXISTS users (
  id TEXT PRIMARY KEY NOT NULL,
  username TEXT NOT NULL,
  email TEXT NOT NULL,
  pw_hash TEXT NOT NULL,
  pw_salt TEXT NOT NULL
);

-- Create messages table
CREATE TABLE IF NOT EXISTS messages (
  id TEXT PRIMARY KEY NOT NULL,
  author_id TEXT REFERENCES users(id),
  created TEXT NOT NULL,
  text TEXT NOT NULL
);

-- Create rooms table
CREATE TABLE IF NOT EXISTS rooms (
  id TEXT PRIMARY KEY NOT NULL,
  name TEXT NOT NULL,
  platform TEXT NOT NULL,
  user_list TEXT NOT NULL, -- TODO: Create a userList view per room?
  chat_log TEXT NOT NULL -- TODO: Create a message view per room?
);
COMMIT;